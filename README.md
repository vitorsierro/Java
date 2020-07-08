# Java
Exercícios praticados em aula aonde o aluno no caso eu fiz.
Obs: em cada pasta tem os  pdf especificando o que foi feito. 
/****************************************************/ 
/* SUNRISING - INÍCIO */ 
/****************************************************/ 
Declare Function DV_CPF_OK PeopleCode SUN_DOC_BRL.EMPLID FieldFormula; 

If %Component = Component.DEPEND_BENEF Then 
   &TAMANHO = Len(SUN_CPF); 
   &CONT = 1; 
   &CPF = ""; 
   While &CONT <= &TAMANHO 
      &LETRA = Substring(SUN_CPF, &CONT, 1); 
      If (&LETRA <> "-") And 
            (&LETRA <> ".") And 
            (&LETRA <> "/") Then 
         &CPF = &CPF | &LETRA; 
      End-If; 
      &CONT = &CONT + 1; 
   End-While; 
   
   &NU_CPF = Substring(&CPF, 1, 9); 
   &DV_CPF = Substring(&CPF, 10, 2); 
   
   If DV_CPF_OK(&NU_CPF, &DV_CPF) = False Then 
      Error MsgGet(22000, 1, "Mensagem não Cadastrada"); 
   End-If; 
End-If; 
/*************************************************/ 
/* SUNRISING - FIM */ 
/*************************************************/ 





/********************************************************/ 
Function Calcula_DV(&CAMPO, &TAM_CAMPO, &PESO_FINAL) Returns string ; 
   &IND = 0; 
   &SOMA = 0; 
   &PESO = 2; 
   While &IND < &TAM_CAMPO 
      &SOMA = &SOMA + Value(Substring(&CAMPO, &TAM_CAMPO - &IND, 1)) * &PESO; 
      If &PESO = &PESO_FINAL Then 
         &PESO = 1; 
      End-If; 
      &PESO = &PESO + 1; 
      &IND = &IND + 1; 
   End-While; 
   &QUOC = Int(&SOMA / 11); 
   &RESTO = &SOMA - &QUOC * 11; 
   If (&RESTO = 1 Or 
         &RESTO = 0) Then 
      &RESTO = 0; 
   Else 
      &RESTO = 11 - &RESTO; 
   End-If; 
   Return Substring(String(&RESTO), 1, 1); 
End-Function; 

/*******************************************************/ 
Function DV_CPF_OK(&NU_CPF_EMPR, &DV_CPF_EMPR) Returns boolean ; 
   &NU_CPF = Rept("0", 9 - Len(&NU_CPF_EMPR)) | &NU_CPF_EMPR; 
   &DV_CPF = Rept("0", 2 - Len(&DV_CPF_EMPR)) | &DV_CPF_EMPR; 
   &PESO_FINAL = 10; 
   &TAM_CAMPO = 9; 
   &DV = Calcula_DV(&NU_CPF, &TAM_CAMPO, &PESO_FINAL); 
   &NU_CPF = &NU_CPF | &DV; 
   &TAM_CAMPO = 10; 
   &PESO_FINAL = 11; 
   &DV = Calcula_DV(&NU_CPF, &TAM_CAMPO, &PESO_FINAL); 
   &NU_CPF = &NU_CPF | &DV; 
   If Substring(&NU_CPF, 10, 2) <> &DV_CPF Then 
      Return False; 
   Else 
      Return True; 
   End-If; 
End-Function; 
