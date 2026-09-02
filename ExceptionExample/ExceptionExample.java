void main()
{
    Scanner scanner = new Scanner(System.in);

    //try to do something first
    try {
    System.out.print("Enter a number: ");
    int x = scanner.nextInt();
    scanner.close();
    System.out.println(x);

    } catch(InputMismatchException e) {
        //catch the exception if the try block cannot be execute
        System.out.println("Invalid integer!");
    }

}