#include<stdio.h>
#include<stdlib.h>

int left_movement(int *requests, int n, int start, int end, int head) {
    int head_movement = 0;

    for(int i = start; i >= end; i--) {
        printf("%d\t", requests[i]);
        head_movement += abs(head - requests[i]);
        head = requests[i];
    }

    return head_movement;
}

int right_movement(int *requests, int n, int start, int end, int head) {
    int head_movement = 0;

    for(int i = start; i <= end; i++) {
        printf("%d\t", requests[i]);
        head_movement += abs(head - requests[i]);
        head = requests[i];
    }

    return head_movement;
}



int main() {
    int n, total_head_movement = 0;

    printf("Enter Total Requests: ");
    scanf("%d", &n);

    int requests[n], head, direction;

    printf("Enter Requests: ");
    for(int i = 0; i < n; i++)  scanf("%d", &requests[i]);

    printf("Enter Initial Head Position: ");
    scanf("%d", &head);

    printf("Enter Dircetion: ");
    scanf("%d", &direction);

    for(int i = 0; i < n - 1; i++) {
        for(int j = i + 1; j < n; j++) {
            if(requests[i] > requests[j]) {
                int temp = requests[i];
                requests[i] = requests[j];
                requests[j] = temp;
            }
        }
    }

    int left, right;

    for(int i = 1; i < n; i++) {
        if(head < requests[i] && head >= requests[i - 1]) {
            left = i - 1;
            right = i;
            break;
        }
    }

    printf("\nOrder: ");
    
    if(direction == 0) {
        total_head_movement += right_movement(requests, n, right, n - 1, head);
        head = 199;
        printf("%d\t", head);
        total_head_movement += abs(head - requests[n - 1]);
        head = 0;
        printf("%d\t", head);
        total_head_movement += 199;
        total_head_movement += right_movement(requests, n, 0, left, head);
    }

    else {
        total_head_movement += left_movement(requests, n, left, 0, head);
        head = 0;
        printf("%d\t", head);
        total_head_movement += requests[0];
        head = 199;
        printf("%d\t", head);
        total_head_movement += 199;
        total_head_movement += left_movement(requests, n, n - 1, right, head);
    }

    printf("\nTotal Head Movement: %d ", total_head_movement);

    return 0;
}