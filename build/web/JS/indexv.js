function interes(){
    var nombre=document.formulario.nombreusuario.value;
    var contraseña=document.formulario.contraseña.value;
    var isChecked = document.getElementById('admin').checked;
    if(isChecked){
        if(nombre=='adal'){
            if(contraseña=='123'){
                location.href="adminwin.jsp"
                return false;
            }
            else{
                alert("La cuenta de administrador ingresada  no existe")
                return false;
            }
        }
    }
    
    if (nombre==""){
        alert("Porfavor, ingresa un nombre de usuario")
        return false;
    }
    if(contraseña==""){
            alert("Porfavor, ingresa una contraseña")
            return false;
     }
     location.href="userwin.jsp"
            
    }
function validarn(e){
    var teclado=(document.all)?e.KeyCode:e.which;
    var patron=/[a-zA-ZÁ-Úá-ú]/;
    var tec=String.fromCharCode(teclado);
    return patron.test(tec);
}