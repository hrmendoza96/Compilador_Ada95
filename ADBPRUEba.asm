.data
   _var: .word 0
   _i: .word 0
   _siguiente: .word 0
   _msg0: .asciiz    "Hola Mundo."
   _msg1: .asciiz    "\n"
   _msg2: .asciiz    "Es menor igual que cero"
   _msg3: .asciiz    "\n"
   _msg4: .asciiz    "Es mayor igual que cero y menor que once."
   _msg5: .asciiz    "\n"
   _msg6: .asciiz    "Es menor que diez"
   _msg7: .asciiz    "\n"
   _msg8: .asciiz    "Es mayor que 1"
   _msg9: .asciiz    "No es mayor que 1"
   _msg10: .asciiz    "\n"
   _msg11: .asciiz    "Hola"
   _msg12: .asciiz    "Es igual que 1"
   _msg13: .asciiz    "\n"
   _msg14: .asciiz    "Es igual a 2"
   _msg15: .asciiz    "\n"
   _msg16: .asciiz    "Es igual que 3"
   _msg17: .asciiz    "\n"
   _msg18: .asciiz    "Es igual a 4"
   _msg19: .asciiz    "\n"
   _msg20: .asciiz    "Es igual que 5"
   _msg21: .asciiz    "\n"
   _msg22: .asciiz    "Es igual a 6"
   _msg23: .asciiz    "\n"
   _msg24: .asciiz    "Es igual que 7"
   _msg25: .asciiz    "\n"
   _msg26: .asciiz    "Es igual a 8"
   _msg27: .asciiz    "\n"
   _msg28: .asciiz    "Es igual a 9"
   _msg29: .asciiz    "\n"
   .text
   .globl main
main:
   li $t0, 1
   sw $t0, _var
   li $t0, 1
   sw $t0, _i
   li $t0, 10
   sw $t0, _siguiente
_etiq0:
   lw $t0, _var
   beq $t0, 1, _etiq1
   b _etiq2
_etiq1:
   li $v0, 4
   la $a0, _msg0
   syscall
_etiq2:
   li $t0, 0
   sw $t0, _var
_etiq3:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq4:
   lw $t0, _var
   ble $t0, 0, _etiq5
   b _etiq6
_etiq5:
   li $v0, 4
   la $a0, _msg2
   syscall
_etiq6:
   li $t0, 10
   sw $t0, _var
_etiq7:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq8:
   lw $t0, _var
   bge $t0, 0, _etiq9
   b _etiq11
_etiq9:
   lw $t0, _var
   blt $t0, 11, _etiq10
   b _etiq11
_etiq10:
   li $v0, 4
   la $a0, _msg4
   syscall
_etiq11:
   li $t0, 0
   sw $t0, _var
_etiq12:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq13:
   lw $t0, _var
   blt $t0, 10, _etiq14
   b _etiq15
_etiq14:
   li $v0, 4
   la $a0, _msg6
   syscall
_etiq15:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq16:
   li $t0, 0
   sw $t0, _var
_etiq17:
   lw $t0, _var
   bgt $t0, 1, _etiq18
   b _etiq19
_etiq18:
   li $v0, 4
   la $a0, _msg8
   syscall
   b _etiq20
_etiq19:
   li $v0, 4
   la $a0, _msg9
   syscall
_etiq20:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq21:
   li $t0, 1
   sw $t0, _var
_etiq22:
   b _etiq23
_etiq23:
   lw $t0, _var
   blt $t0, 10, _etiq24
   b _exit
_etiq24:
   li $v0, 4
   la $a0, _msg11
   syscall
_etiq25:
   lw $t0, _var
   beq $t0, 1, _etiq26
   b _etiq29
_etiq26:
   li $v0, 4
   la $a0, _msg12
   syscall
_etiq27:
   li $t0, 2
   sw $t0, _var
_etiq28:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq29:
   lw $t0, _var
   beq $t0, 2, _etiq30
   b _etiq33
_etiq30:
   li $v0, 4
   la $a0, _msg14
   syscall
_etiq31:
   li $t0, 3
   sw $t0, _var
_etiq32:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq33:
   lw $t0, _var
   beq $t0, 3, _etiq34
   b _etiq37
_etiq34:
   li $v0, 4
   la $a0, _msg16
   syscall
_etiq35:
   li $t0, 4
   sw $t0, _var
_etiq36:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq37:
   lw $t0, _var
   beq $t0, 4, _etiq38
   b _etiq41
_etiq38:
   li $v0, 4
   la $a0, _msg18
   syscall
_etiq39:
   li $t0, 5
   sw $t0, _var
_etiq40:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq41:
   lw $t0, _var
   beq $t0, 5, _etiq42
   b _etiq45
_etiq42:
   li $v0, 4
   la $a0, _msg20
   syscall
_etiq43:
   li $t0, 6
   sw $t0, _var
_etiq44:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq45:
   lw $t0, _var
   beq $t0, 6, _etiq46
   b _etiq49
_etiq46:
   li $v0, 4
   la $a0, _msg22
   syscall
_etiq47:
   li $t0, 7
   sw $t0, _var
_etiq48:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq49:
   lw $t0, _var
   beq $t0, 7, _etiq50
   b _etiq53
_etiq50:
   li $v0, 4
   la $a0, _msg24
   syscall
_etiq51:
   li $t0, 8
   sw $t0, _var
_etiq52:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq53:
   lw $t0, _var
   beq $t0, 8, _etiq54
   b _etiq57
_etiq54:
   li $v0, 4
   la $a0, _msg26
   syscall
_etiq55:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq56:
   li $t0, 9
   sw $t0, _var
_etiq57:
   lw $t0, _var
   beq $t0, 9, _etiq58
   b _etiq23
_etiq58:
   li $v0, 4
   la $a0, _msg28
   syscall
_etiq59:
   li $v0, 4
   la $a0, _msg1
   syscall
_etiq60:
   li $t0, 10
   sw $t0, _var
   b _etiq23
_exit:
   li $v0, 10
   syscall