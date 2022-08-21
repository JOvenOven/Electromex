function interes(){
    var nombre=document.formulario.nombre.value;
    var contraseña=document.formulario.contra.value;
    var confirmarcon=document.formulario.confirmarcontra.value;
    var tarifa=formulario.ttarifa.selectedIndex;
    
    if (nombre==""){
        alert("Porfavor, ingresa un nombre de usuario")
        return false
    }
    if (contraseña==""){
        alert("Porfavor, ingresa una contraseña")
        return false
    }
    if(confirmarcon==""){
        alert("Porfavor, ingresa la confirmación de la contraseña")
        return false
    }
    if (tarifa==""){ 
        alert ("Por favor selecciona un tipo de tarifa") 
        return false 
        }
    var contraseñai=String(contraseña);
    var contraseñas=String(confirmarcon);
    if(contraseñai!=contraseñas){
        alert ("Las contraseñas ingresadas no coinciden, por favor verifica que conincidan")
        return false
    }
    if(contraseñai==contraseñas){
        alert("Registro completado exitosamente")
        location.href="propiedades.jsp"
    }
    
}

function validarn(e){
    var teclado=(document.all)?e.KeyCode:e.which;
    var patron=/[a-zA-ZÁ-Úá-ú]/;
    var tec=String.fromCharCode(teclado);
    return patron.test(tec);
}