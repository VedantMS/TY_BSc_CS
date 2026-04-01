#include <stdio.h>
#include <stdlib.h>

int main() {
    int totalBlocks, headPos, n;
    
    printf("Enter total number of disk blocks: ");
    scanf("%d", &totalBlocks);
    
    printf("Enter current head position: ");
    scanf("%d", &headPos);
    
    printf("Enter number of disk requests: ");
    scanf("%d", &n);
    
    int requests[n];
    printf("Enter disk request sequence: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &requests[i]);
    }
    
    printf("\nDisk Scheduling - FCFS Algorithm\n");
    printf("==================================\n");
    printf("Initial head position: %d\n", headPos);
    printf("Request sequence: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", requests[i]);
    }
    printf("\n\n");
    
    int totalHeadMovement = 0;
    printf("Order of service:\n");
    
    for (int i = 0; i < n; i++) {
        int distance = abs(requests[i] - headPos);
        totalHeadMovement += distance;
        printf("Request %d: Block %d, Head movement: %d\n", i + 1, requests[i], distance);
        headPos = requests[i];
    }
    
    printf("\n==================================\n");
    printf("Total head movements: %d\n", totalHeadMovement);
    printf("Average head movement: %.2f\n", (float)totalHeadMovement / n);
    
    return 0;
}