#include <stdio.h>
#include <string.h>

//This declares an array of chars AKA string, prints the string and the length of the string
int myfancystrlen()
{
    char greeting[] = "Hello Universe!!!";
    int length = strlen( greeting );
    printf( "Greeting message: %s\n", greeting );
    printf( "%d\n", length );
}

//Copies string2 into string1 and prints the contents of string1
void copyString()
{
    char string1[] = "String 1";
    char string2 [] = "String 2";
    strcpy( string1, string2 );
    printf( "%s\n", string1 );
}

//Decleares two strings, prints the first string and adds the second string to the end of the first
void concatenateString()
{
    char s1[] = "This is a string";
    char s2 [] = "this is another string";
    strcat( s1, s2 );
    printf( "%s\n", s1 );
}

//Compares both strings to see if they are equal to each other
//There is a long way of comparing with if and else statements or a short way using a ternary operator
void compareString()
{
    char s1[] = "This is a string";
    char s2 [] = "This is a string";
    int compare = strcmp( s1, s2 );

    compare == 0 ? printf( "These two strings are the same" ) : printf( "These two strings are not the same" );
/*    if( compare == 0 )
    {
        printf( "These two strings are the same" );
    }

    else
    {
        printf( "These two strings are not the same" );
    }*/
}

void main()
{
    myfancystrlen();
    copyString();
    concatenateString();
    compareString();
}