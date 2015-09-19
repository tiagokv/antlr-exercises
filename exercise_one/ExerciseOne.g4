grammar ExerciseOne;

init: comando;

comando:   comando op=(ENTAO|APOS|NEWLINE) comando #dep
        |  LPAR comando RPAR                    #pars
        |  basico                               #bas
        |  NEWLINE                              #newline
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
