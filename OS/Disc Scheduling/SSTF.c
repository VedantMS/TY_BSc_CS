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
    while(left >= 0 || right <= n - 1) {
        if(left >= 0 && right <= n - 1) {
            if(abs(head - requests[left]) <= abs(head - requests[right])) {
                printf("%d\t", requests[left]);
                total_head_movement += abs(head - requests[left]);
                head = requests[left];
                left--;
            }

            else {
                printf("%d\t", requests[right]);
                total_head_movement += abs(head - requests[right]);
                head = requests[right];
                right++;
            }
        }

        else if(left >= 0) {
            printf("%d\t", requests[left]);
            total_head_movement += abs(head - requests[left]);
            head = requests[left];
            left--;

        }

        else {
            printf("%d\t", requests[right]);
            total_head_movement += abs(head - requests[right]);
            head = requests[right];
            right++;
        }
    }

    printf("\nTotal Head Movement: %d ", total_head_movement);

    return 0;
}