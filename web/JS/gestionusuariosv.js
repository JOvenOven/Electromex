function interes(){
    var nombre=document.formulario.nombreusuario.value;
    var id=document.formulario.idusuario.value;
    if (nombre=="" && id==""){
        alert("Por favor ingresa un nombre o id de usuario")
        return false;
    }

}
function validarn(e){
    var teclado=(document.all)?e.KeyCode:e.which;
    var patron=/[a-zA-ZÁ-Úá-ú]/;
    var tec=String.fromCharCode(teclado);
    return patron.test(tec);
}
function validars(e){
    var teclado=(document.all)?e.KeyCode:e.which;
    var tec=String.fromCharCode(teclado);
    var patron=/[0-9-\d]/;
    return patron.test(tec);
}