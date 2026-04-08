#include <mpi.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[])
{
    MPI_Init(NULL, NULL);

	int world_rank;
	MPI_Comm_size(MPI_COMM_WORLD, &world_rank);

    int arr[1000];
	int sum = 0;

	printf("Generated 1000 random numbers: \n");

    srand(time(NULL));
    for (int i = 0; i < N; i++) {
            arr[i] = rand() % 1000;
			printf("%d\t", arr[i]);

			sum += arr[i];
        }

	printf("\nTotal Sum = %d\n", sum);

    MPI_Finalize();
	
    return 0;
}