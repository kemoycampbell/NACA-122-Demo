// Animal animal = new Animal();

// Console.WriteLine(animal.Name);
// Console.WriteLine(animal.name);

//Accepting number from the user and perform the sum
Console.Write("Enter the first number:");
int num1 = int.Parse(Console.ReadLine());
Console.Write("Enter the second number:");
int num2 = int.Parse(Console.ReadLine());

int sum = Sum(num1,num2);

Console.WriteLine($"{num1} + {num2} = {sum}");


// int sum = Sum(1,2);
// Console.WriteLine($"The sum of 2+1={sum}");

// ///<summary>
// /// 
// /// </summary>
int Sum(int num1, int num2)
{
    return num1 + num2;
}

