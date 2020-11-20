<!DOCTYPE html>
<html>
<body>
<p>in</p>
<?php 
$x=$_POST["input"];
$y=$_POST["conversion"];
if($y=="km"){
    echo "Distance in miles: ".$x*1.609;
}
else{
    echo "Distance in kilometres: ".$x/1.609;
}
?>

</body>
</html>