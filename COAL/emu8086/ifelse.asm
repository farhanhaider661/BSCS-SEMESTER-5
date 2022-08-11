include 'emu8086.inc'
.model
.code
main proc
    mov al,5 
    mov bl,8
    cmp al,bl
    je l1 ;if al == bl
    print 'both numbers are not equal';else it print not equal
    jmp exit:
    l1:  ;then print
    print 'both number are equal'
    exit:
    main endp
end main