/*
    Write a program to simulate Contiguous file allocation method. Assume disk with n 
    number of blocks. Give value of n as input. Randomly mark some block as allocated and 
    accordingly  maintain  the  list  of  free  blocks  Write  menu  driver  program  with  menu 
    options as mentioned above and implement each option.
    
    • Show Bit Vector
    • Create New File
    • Show Directory
    • Delete File
    • Exit
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

typedef struct Directory {
    char fname[20];
    int start;
    int len;
} Directory;

Directory dir[20];
int dirCount = 0;

int *bit, n;

void show_bit_vector() {
    printf("Bit Vector: \n");
    for(int i = 0; i < n; i++)  printf("%d\t", bit[i]);
    printf("\n");
}

void create() {
    char name[20];
    int blocks;
    
    printf("Enter File Name: ");
    scanf("%s", name);

    printf("Enter Number of Blocks: ");
    scanf("%d", &blocks);

    int count = 0, start = -1;

    for(int i = 0; i < n; i++) {
        if(bit[i] == 0) {
            if(count == 0)          start = i;
            count++;
            if(count == blocks)     break;
        }
    }

    if(count == blocks) {
        for(int i = start; i < start + blocks; i++)     bit[i] = 1;

        strcpy(dir[dirCount].fname, name);
        dir[dirCount].start = start;
        dir[dirCount].len = blocks;
        
        dirCount++;

        printf("File %s is allocated. \n", name);
    }

    else    printf("Contiguous File Blocks not available. \n");
}

void show_directory() {
    if(dirCount == 0) {
        printf("Directory is empty. \n");
        return;
    }

    printf("Name\tStart\tLength \n");
    for(int i = 0; i < dirCount; i++)
        printf("%s\t%d\t%d \n", dir[i].fname, dir[i].start, dir[i].len);
}

void delete_file() {
    char name[20];

    printf("Enter File to be Deleted: ");
    scanf("%s", name);

    int found = -1;

    for(int i = 0; i < dirCount; i++) {
        if(strcmp(name, dir[i].fname) == 0) {
            found = i;
            break;
        }
    }

    if(found == -1) {
        printf("File does not exist. \n ");
        return;
    }

    for(int i = dir[found].start; i < dir[found].start + dir[found].len; i++)
        bit[i] = 0;

    for(int i = found; i < dirCount - 1; i++)   dir[i] = dir[i + 1];

    dirCount--;
    printf("File Deleted Successfully. \n ");
}

int main() {
    printf("Enter Total Blocks: ");
    scanf("%d", &n);

    bit = (int *)malloc(n * sizeof(int));

    srand(time(NULL));
    for(int i = 0; i < n; i++)  bit[i] = rand() % 2;

    printf("\n1.\tShow Bit Vector \n2.\tCreate New File \n3.\tShow Directory \n4.\tDelete Directory \n5.\tExit \n");

    while(1) {
        int choice;
        
        printf("\nEnter Choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1:     show_bit_vector();
                        break;

            case 2:     create();
                        break;

            case 3:     show_directory();
                        break;

            case 4:     delete_file();
                        break;

            case 5:     exit(0);

            default:    printf("Enter Valid Choice. \n ");
        }
    }

    return 0;
}