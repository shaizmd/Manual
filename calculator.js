function cls(){
    document.getElementById("num1").value = "";
    document.getElementById("num2").value = "";
    document.getElementById("result").value = "";
}
function showresult(c){
    let a = parseFloat(document.getElementById("num1").value);
    let b = parseFloat(document.getElementById("num2").value);
    let r;
    switch(c){
        case 1: r=a+b; break;
        case 2: r=a-b; break;
        case 3: r=a*b; break;
        case 4: r=a/b; break;
        default: break;
    }
    document.getElementById("result").value = r;
}