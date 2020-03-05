<ul>
{
for $x in doc("./files/xml/recetario1.xml")/Recetario/recetas/recetas/nombre
order by $x
return <li>{$x}</li>
}
</ul>