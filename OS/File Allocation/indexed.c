/*
    Write  a  program  to  simulate  Indexed  file  allocation  method.  Assume  disk  with  n 
    number of blocks. Give value of n as input. Randomly mark some block as allocated and 
    accordingly  maintain  the  list  of  free  blocks. Write  menu  driver  program  with  menu 
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
    int len;
    int *block;
    struct Directory *next;
} Directory;

Directory *first = NULL, *last = NULL;

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

    int count = 0;

    for(int i = 0; i < n; i++) {
        if(bit[i] == 0)         count++;
        if(count == blocks)     break;
    }

    if(count == blocks) {
        Directory *p = (Directory *)malloc(sizeof(Directory));

        strcpy(p->fname, name);
        p->len = blocks;
        p->next = NULL;

        int index = 0;
        p->block = (int *)malloc(blocks * sizeof(int));
        for(int i = 0; i < n; i++) {
            if(bit[i] == 0) {
                bit[i] = 1;
                p->block[index++] = i;
            }
            if(index == count)  break;
        }

        if(!first) {
            first = p;
            last = p;
        }

        else {
            last->next = p;
            last = p;
        }

        printf("File %s is allocated. \n", name);
    }

    else    printf("Space not available. \n");
}

void show_directory() {
    if(!first) {
        printf("Directory is empty. \n");
        return;
    }

    printf("Name\tLength \n");

    Directory *p = first;

    while(p) {
        printf("%s\t%d\n", p->fname, p->len);
        p = p->next;
    }
}

void delete_file() {
    char name[20];

    printf("Enter File to be Deleted: ");
    scanf("%s", name);

    Directory *p = NULL, *q = first;

    while(q && strcmp(name, q->fname) != 0) {
        p = q;
        q = q->next;
    }

    if(!q) {
        printf("File does not exist. \n");
        return;
    }

    for(int i = 0; i < q->len; i++)     bit[q->block[i]] = 0;

    if(q == first && q == last) {
        first = NULL;
        last = NULL;
    }

    else if(q == first) {
        first = first->next;
    }

    else if(q == last) {
        last = p;
        p->next = NULL;
    }

    else {
        p->next = q->next;
    }

    printf("File Deleted Successfully. \n");
}

int main() {
    printf("Enter Total Blocks: ");
    scanf("%d", &n);

    bit = (int *)malloc(n * sizeof(int));

    printf("\n1.\tShow Bit Vector \n2.\tCreate New File \n3.\tShow Directory \n4.\tDelete Directory \n5.\tExit \n");

    srand(time(NULL));
    for(int i = 0; i < n; i++)  bit[i] = rand() % 2;

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

            default:    printf("Enter Valid Choice. \n");
        }
    }

    return 0;
}