#include<stdio.h>
#include<stdlib.h>

int main() {
    int n, total_head_movement = 0;

    printf("Enter Total Requests: ");
    scanf("%d", &n);

    int requests[n], head;

    printf("Enter Requests: ");
    for(int i = 0; i < n; i++)  scanf("%d", &requests[i]);

    printf("Enter Initial Head Position: ");
    scanf("%d", &head);

    printf("\nOrder: ");
    for(int i = 0; i < n; i++) {
        printf("%d\t", requests[i]);
        total_head_movement += abs(head - requests[i]);
        head = requests[i];
    }

    printf("\nTotal Head Movement: %d ", total_head_movement);

    return 0;
}