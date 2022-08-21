function delete_row(no)
{
 document.getElementById("row"+no+"").outerHTML="";
}
function guardar(){
    alert("Datos guardados exitosamente")
}
function inters(){
    var vari=document.formulario.nombrevariable.value;
    var impacto=document.formulario.impactov.value;
    if (vari=="Ingrese el nombre de la variable" || vari==""){
        alert("Porfavor, ingresa un nombre de variable ")
        return false
    }
    if (impacto=="Ingrese el impacto sobre el precio de la luz" || impacto==""){
        alert("Porfavor, ingresa el impacto sobre el precio de la luz")
        return false
    }
    var table=document.getElementById("variables");
    var table_len=(table.rows.length);
    var row = table.insertRow(table_len).outerHTML="<tr id='row"+table_len+"'><td id='var_row"+table_len+"'>"+vari+"</td><td id='impc_row"+table_len+"'>"+impacto+"</td><td><input type='button' value='Eliminar' class='delete' onclick='delete_row("+table_len+")'></td></tr>";
}