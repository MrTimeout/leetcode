;The 6502 has only a small number of registers compared to other processor of the same era.
;
;Program Counter(PC)
; - 16 bit register
; - Points to the next instruction to be executed.
; - The value of the program counter is modified automatically as instructions are executed.
; - The value of the program counter can be modified by executing:
;   + a jump
;   + a relative branch
;   + a subroutine call to another address or by returning from a subrouting or interrupt.
;
;Stack Pointer(SP)
; - 8 bit register
; - 256 byte stack
; - Located between $0100 and $01ff
; - holds the low 8 bits of the next free location on the stack.
; - The location of the stack is fixed and cannot be moved.
; - Pushing Bytes to the stack causes the stack pointer to be decremented.
; - Pulling Bytes from the stack causes the stack pointer to be incremented.
; - The CPU does not detect if the stack is overflowed by exessive pushing or pulling operations and will most likely result in the program crashing.
;
;Accumulator(A)
