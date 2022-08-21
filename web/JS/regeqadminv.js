function delete_row(no)
{
 document.getElementById("row"+no+"").outerHTML="";
}
function guardar(){
    alert("Datos guardados exitosamente")
}
function interes(){
    var equipo=document.formulario.nombreequipo.value;
    var kilo=document.formulario.kilo.value;
    if (equipo=="Ingresa el Nombre del Nuevo Equipo" || equipo==""){
        alert("Porfavor, ingresa un nombre de equipo ")
        return false
    }
    if (kilo=="Kilowatts-Hora" || kilo==""){
        alert("Porfavor, ingresa la cantidad de kilowatts ")
        return false
    }
    if(kilo<=0 || kilo>=999999){
        alert("El numero de consumo de kilowatt debe ser mayor a 0 y menor a 999999")
        return false
    }
    var table=document.getElementById("tablita");
    var table_len=(table.rows.length);
    var row = table.insertRow(table_len).outerHTML="<tr id='row"+table_len+"'><td id='equi_row"+table_len+"'>"+equipo+"</td><td id='kilo_row"+table_len+"'>"+kilo+"</td><td><input type='button' value='Eliminar' class='delete' onclick='delete_row("+table_len+")'></td></tr>";
}

function validars(e){
    var teclado=(document.all)?e.KeyCode:e.which;
    var tec=String.fromCharCode(teclado);
    var patron=/[0-9-\d]/;
    return patron.test(tec);
}