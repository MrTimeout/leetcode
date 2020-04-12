#include <stdio.h>
#include <stdlib.h> //Here is malloc function

struct node {
    int val;
    struct node* next;
};

struct node* insert(struct node* head, int val) {
    if (head == NULL) {
        head = (struct node*) malloc(sizeof(struct node));
        head->val = val;
        head->next = NULL;
    } else {
        struct node* temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        struct node* a = (struct node*) malloc(sizeof(struct node));
        a->val = val;
        temp->next = a;
    }
    return head;
}

struct node* insertAtNth(struct node* head, int pos, int val) {
    if (pos < 0) return head;
    if (pos == 0) {
        struct node* a = (struct node*) malloc(sizeof(struct node));
        a->val = val;
        a->next = head;
        return a;
    }
    struct node* temp = head;
    int cont = 0;
    while (cont < pos && temp != NULL && temp->next != NULL) {
        temp = temp->next;
    }
    struct node* a = (struct node*) malloc(sizeof(struct node));
    a->val = val;
    a->next = temp->next == NULL ? NULL : temp->next->next;
    temp->next = a;
    return head;
}

void printNodes(struct node* head) {
    struct node* temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->val);
        temp = temp->next;
    }
    printf("NULL\n");
}

int main(void) {
    int n, k;
    scanf("%d", &n);
    k = n;
    struct node* head = NULL;
    while (n-- > 0) {
        int temp;
        scanf("%d", &temp);
        head = insert(head, temp);
    }
    printNodes(head);
    head = insertAtNth(head, 0, 10);
    printNodes(head);
    head = insertAtNth(head, k+1, 10);
    printNodes(head);
    return 0;
}
