<ul>
{
for $x in doc("./files/xml/prueba.xml")/Recetario/recetas/recetas/nombre
order by $x
return <li>{$x}</li>
}
</ul>