lexer grammar validator; 

@lexer::members {
  int count = 0;
}

EndTag: '</' VALIDELEMENT '>'
 {
    System.out.println("End Tag: " + getText());
};

StartTag: '<' VALIDELEMENT '>' {
    System.out.println("Start Tag: " + getText());
};


Email: (DIGIT_ALPHA | EMAIL_SPECIALCHAR) (DIGIT_ALPHA | EMAIL_SPECIALCHAR | '.' ~'.')* '@' (DIGIT_ALPHA* | DIGIT_ALPHA* [.-] DIGIT_ALPHA*) '.' ALPHA+ {
			System.out.println("Email: " + getText());
		};

Date:  ('0' '1'..'9' | '1' '0'..'9'| '2' '0'..'9'| '3' '0'..'1') '/' (('0' | '1') ('1' | '2')) '/' YEARS{ 
		System.out.println("Date: " + getText());
};

Phone: (DIGIT | '(') DIGIT DIGIT (DIGIT | '-' | '.' | ' ') (DIGIT | ')' ) (DIGIT | '.' | '-' | ' ') DIGIT (DIGIT | '-' | '.' | ' ') DIGIT (DIGIT | '.' | '-' | ' ') (DIGIT DIGIT DIGIT DIGIT | DIGIT DIGIT){
		
		System.out.println("Phone: " + getText());
};

CreditCard: (VISA | MASTER | AMERICAN_EXPRESS | DINERS_CLUB | DISCOVER | JCB) {

		System.out.println("Credit card: " + getText());
	
};

//fragment VALIDELEMENT:  ((('x'|'X') ('m'|'M') (~'l'| ~'L')) | (('x'|'X') (~'m'|~'M')) | (~'x') | '_') (DIGIT_ALPHA | [-_.])*;
fragment VALIDELEMENT:  ('x' 'm' ~'l'| 'x' ~'m' | ~'x' | '_') (DIGIT_ALPHA | [-_.])*;
fragment DIGIT: [0123456789];
fragment ALPHA: [a-zA-Z];
fragment DIGIT_ALPHA : [0123456789a-zA-Z];
fragment EMAIL_SPECIALCHAR: [-_~!$&'()*+,;=:];
fragment YEARS: ('20' '0'..'9' '0'..'9') | ('2100');
fragment VISA: '4' (DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT);
fragment MASTER: '5' '1'..'5' DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT;
fragment AMERICAN_EXPRESS: '3' '4'..'7' DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT  '-' DIGIT DIGIT DIGIT DIGIT DIGIT;
fragment DINERS_CLUB: ('3' ('0' '0'..'5' DIGIT | ('6' | '8') DIGIT DIGIT) '-' DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT  '-' DIGIT DIGIT DIGIT DIGIT) | ('5' DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT);
fragment DISCOVER: ('6011' | '65' DIGIT DIGIT) '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT;
fragment JCB: (('2131' | '1800') '-' DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT DIGIT) | ('35' DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT);


WS: [\n]+ {skip();};
