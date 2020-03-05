<html>
<body>

<h1>Recetario</h1>

<ul>
{
for $x in 
doc("./files/xml/recetario1.xml")/Recetario/recetas/recetas
order by $x/nombre
return <li class="{data($x/@dificultad)}">{data($x/nombre)}</li>
}
</ul>

</body>
</html>