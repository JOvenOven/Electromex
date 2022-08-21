function interes(){
    var bimestres=document.formulario.nobimestres.value;
    if (bimestres==""){
        alert("Porfavor, ingresa un bimestre")
        return false
    }
    if (bimestres<=0){
        alert("Porfavor, ingresa un bimestre mayor a 0")
        return false
    }
}

function validarn(e){
    var teclado=(document.all)?e.KeyCode:e.which;
    var tec=String.fromCharCode(teclado);
    var patron=/[0-9-\d]/;
    return patron.test(tec);
}