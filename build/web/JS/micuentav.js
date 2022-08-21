function interes(){
    var nombre=document.formulario.nombreusuario.value;
    var contraseña=document.formulario.contraseña.value;
    var t = document.getElementById("selecttarifa");
    var tarifa = t.options[t.selectedIndex].text;
    var st = document.getElementById("selectdel");
    var delegacion = st.options[st.selectedIndex].text;
    var tar=formulario.ttarifa.selectedIndex;
    var del=formulario.delegacionza.selectedIndex ;
    var fecha=document.formulario.contraseña.value;

    if (nombre==""){
        alert("Porfavor, ingresa un nombre de usuario")
        return false
    }
    if (contraseña==""){
        alert("Porfavor, ingresa una contraseña")
        return false
    }
    if (tar==""){ 
        alert ("Por favor selecciona un tipo de tarifa") 
        return false 
        }
    if (del==""){ 
        alert ("Por favor selecciona una delegación") 
        return false 
    }
    
    alert ("Cambios realizados correctamente") 
}
function modificar(){
    location.href="modificarcuenta.jsp"
}

function validarn(e){
    var teclado=(document.all)?e.KeyCode:e.which;
    var patron=/[a-zA-ZÁ-Úá-ú]/;
    var tec=String.fromCharCode(teclado);
    return patron.test(tec);
}