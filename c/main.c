#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int sumArray(int arr[], int size) {
    int sum = 0;
    for (int i = 0; i < size; i++)
        sum += arr[i];
 
    return sum;
}

char* concatString(char* str1, char* str2, char* result) {
    strcpy(result, str1);
    strcat(result, str2);
    return result;
}

struct Cat {
    char* name;
    int age;
};

int main() {
    int numbers[] = {1, 2, 3, 4, 5};
    int sum = sumArray(numbers, 5);
    printf("%d\n", sum);
    
    char str1[] = "Hello ";
    char str2[] = "world";
    char* resultString = malloc(strlen(str1) + strlen(str2));
    resultString = concatString(str1, str2, resultString);
    printf("%s\n", resultString);
    free(resultString);
    
    struct Cat catBoy = {"Tom", 3};
    printf("Name: %s, age: %d.", catBoy.name, catBoy.age);
        
    return 0;
}