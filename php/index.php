<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Php code</title>
</head>
<body>
    <?php
    function sumArray(Array $arr) : int { 
        $sum = 0;
        for ($i = 0; $i < count($arr); $i++) { 
            $sum = $sum + $arr[$i];
        }
        return $sum; 
    }
    $numbers = array(1, 2, 3, 4, 5);
    $sum = sumArray($numbers);

    class Cat {
        private string $name;
        private int $age;

        function __construct(string $name, int $age) {
            $this->name = $name;
            $this->age = $age;
        }

        public function toString() {
            return "Name: ".$this->name.". Age: ".$this->age.".";
        }
    }
    $catBoy = new Cat("Tom", 3);

    ?>

    
    <H1>Сумма элементов массива равна <?php echo $sum ?></H1>
    <p><?php echo $catBoy->toString() ?></p>
</body>
</html>