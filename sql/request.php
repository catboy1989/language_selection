<?php
$host = 'localhost'; // адрес сервера
$db_name = 'test'; // имя базы данных
$user = 'root'; // имя пользователя
$password = ''; // пароль

$connection = new mysqli($host, $user, $password, $db_name);
 
if($connection->connect_error){
    die("Ошибка: " . $connection->connect_error);
}


$query = 'SELECT * FROM products';

if($sqlResponse = $connection->query($query)){
    foreach($sqlResponse as $row) {
		echo  $row['product_name'];
		echo  ' - ';
		echo  $row['category'];
		echo  ' - ';
		echo  $row['price'];
		echo  '<br>';
	}
    $result->free();
} else{
    echo "Ошибка: " . $connection->error;
}


 mysqli_close($connection);


?>