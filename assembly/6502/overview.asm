;Types of number:
; - Any number prefixed with $ in 6502 is in hexadecimal format.
; - Anything prefixed with # is a literal number value.
; - Any other value refers to a memory location.
;
;When the program starts and get to the first instruction:
;A has changed from $00 to $01
;PC(Program Counter) has changed from $0600 to $0602
;This instruction loads the value #$01 into the A register.
LDA #$01
;This simulator (JavaScript simulator of 6502 assembly language) uses the memory locations $0200 to $05ff
;to draw pixels on its display. Here we are storing the value of the register A in the position of memory
;$0200. The colors go from $00 to $0f.
STA $0200
LDA #$02
STA $0201
LDA #$03
STA $0202
BRK ; Break the execution of the program
