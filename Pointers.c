#include <stdio.h>
#include <ctype.h>

void changeContentPointers()
{
    //Create a variable and give the address of that variable to pointer
    int number = 15;
    int* pointer = &number;

    //This is the value of the variable pointer is pointing to, 15
    printf( "The value being held at pointer is: %d\n", *pointer );

    //This is the address of the pointer
    printf( "The address of pointer is: %p\n", pointer );

    //Assign the address of pointer and put it into pointer1
    //Print the address of pointer1 to show that is the same address as pointer
    int* pointer1 = pointer;
    printf( "The address of pointer1 is: %p\n", pointer1 );

    //Change the value of what pointer is pointing to, this will change the value of number
    //since that is what pointer is pointing to
    *pointer = 25;
    printf( "The value being held at pointer is: %d\n", number );

    //Declare a character and give the address of character to charptr
    //Print the value of what charptr is pointing to, a
    char character = 'a';
    char* charptr = &character;
    printf( "The value of this character is %c\n", *charptr );

    //Change the value of the content of what charptr is pointing to, this changes the value of character
    *charptr = 'D';
    printf( "The value of this character is %c\n", *charptr  );

    //C doesn't have a String type but you're able to give a string to a char pointer because it stores the value
    //of the first character and all the characters after that are stored consecutively in memory
    char string[] = "hello universe!!!!!";
    char* ptr = string;
    int i;
    int length = strlen( string );

    //Capitalize a string
    for( i = 0; i <= length; ++i )
    {
        *ptr = toupper( *ptr );
        ptr = ptr + 1;
    }

    //Have a string be lower case
    ptr = string;
    for( i = 0; i <= length; ++i )
    {
        *ptr = tolower( *ptr );
        ptr = ptr + 1;
    }

    printf( "%s\n", string );
}

void main()
{
    changeContentPointers();
}