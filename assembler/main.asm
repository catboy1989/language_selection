format PE console

entry Start

include 'win32a.inc'

section '.data' data readable writable

        arr db 1,2,3,4,5
        arrSize db 5
        formatNumber db '%d',0


section '.code' code readable executable
        Start:
                mov edi, arr
                xor eax, eax
                mov al, [edi]
                xor ecx, ecx
                mov cl, [arrSize]
                dec ecx

                arrLoop:
                        inc edi
                        add al, [edi]
                loop arrLoop

                push eax
                push formatNumber
                call [printf]

                call [getch]
                push NULL
                call [ExitProcess]   


section '.idata' import data readable
        library kernel, 'kernel32.dll',\
                msvcrt, 'msvcrt.dll'
        import kernel,\
               ExitProcess, 'ExitProcess'
        import msvcrt,\
               printf, 'printf',\
               getch, '_getch'                                          