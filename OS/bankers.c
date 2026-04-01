#include<stdio.h>
#include<stdlib.h>

int main() {
    int allocation[5][3] = {{2, 3, 2},
                            {4, 0, 0},
                            {5, 0, 4},
                            {4, 3, 3},
                            {2, 2, 4}};
    
    int max[5][3] = {   {9, 7, 5},
                        {5, 2, 2},
                        {1, 0, 4},
                        {4, 4, 4},
                        {6, 5, 5}};

    int available[3] = {3, 3, 2};

    int need[5][3];
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 3; j++) {
            need[i][j] = max[i][j] - allocation[i][j];
        }
    }
    
    int safe_sequence[5];
    int index = 0;
    
    int added[5] = {0, 0, 0, 0, 0};
    
    while(1) {
	    int flag = 0;

        for(int i = 0; i < 5; i++) {
            int can_allocate = 1;

            for(int j = 0; j < 3; j++) {
                if(need[i][j] > available[j]) {
                    can_allocate = 0;
                    break;
                }
            }

            if(can_allocate && !added[i]) {
                for(int j = 0; j < 3; j++)      available[j] += allocation[i][j];
                
                safe_sequence[index++] = i;
                added[i] = 1;
                flag = 1;
            }
        }

	    if(!flag)	break;
    }

    if(index < 5)   printf("System is not in a safe state.\n");
    
    else {
        printf("System is in a safe state.\n ");
        printf("Safe Sequence: \n ");
        for(int i = 0; i < 5; i++) {
            printf("P%d\t", safe_sequence[i]);
        }
    }
    
    return 0;
}