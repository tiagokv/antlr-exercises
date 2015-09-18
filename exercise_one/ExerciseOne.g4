grammar ExerciseOne;

comando:   comando (ENTAO|APOS|NEWLINE) comando
        |  LPAR comando RPAR
        |  basico
        |  NEWLINE
        ;

basico:    FRENTE   INT
      |    ESQUERDA INT
      |    DIREITA  INT
      |    TRAS     INT
      ;

FRENTE    :'FRENTE' ;
ESQUERDA  :'ESQUERDA';
DIREITA   :'DIREITA';
TRAS      :'TRAS';
ENTAO     :'ENTAO';
APOS      :'APOS';
LPAR      :'(';
RPAR      :')';
INT       :[0-9]+ ;
NEWLINE   :'\r'? '\n' ;
WS        :[ \t]+ -> skip ;
