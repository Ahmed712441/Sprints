const result = document.getElementById('result')
const boxes = document.getElementsByClassName('box')
const num1 = document.getElementById('num1')
const num2 = document.getElementById('num2')
var current_active = 'num1';
var current_op = null;



num1.addEventListener('focusin',()=>{
    current_active = 'num1'
})
num2.addEventListener('focusin',()=>{
    current_active = 'num2'
})

function perform(n1,n2,op){
    if (op === '+'){
        return n1+n2
    }
    else if(op === '-'){
        return n1-n2
    }
    else if(op === '/'){
        return (n1/n2).toFixed(2)
    }
    else if(op === '*'){
        return n1*n2
    }else{
        throw 'unknow operation'
    }
}

function onClick(val){
    console.log(val)
    if (val === '+'|| val === '-'||val === '/'||val === '*'){
        current_op = val
    }else if(val==='=' && current_op){
        try{
            result.innerText = perform(parseInt(num1.value),parseInt(num2.value),current_op)
        }catch(err){
            alert(err)
        }
    }else if(val==='='){
        alert('You need to choose operation')
    }else{
        if(current_active === 'num1' ){
            num1.value = num1.value+val
        }else{
            num2.value = num2.value+val
        }
    }
}

for(var i=0;i<boxes.length;i++){
    const txt = boxes[i].innerText
    boxes[i].addEventListener('click',()=>{
        onClick(txt)
    })
}

