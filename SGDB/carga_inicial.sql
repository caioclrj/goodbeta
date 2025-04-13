INSERT INTO CLIENTE (ID, TX_NOME, ID_STATUS, TX_APELIDO, TX_SENHA) 
VALUES (1, 'Bernardo', true, 'Tinico', 'SenhaBoa'),
       (2, 'Leonardo', false, 'Leo', 'SenhaRuim');
	   
INSERT INTO TREINO (ID, TX_DESCRICAO, TX_MODULO, TX_TIPO, TX_LOCALIZADO, NR_DURACAO, NR_REPETICAO, NR_ORDEM)
VALUES (1,'Abrir e fechar braços na linha dos ombro. Braços para cima e para baixo. Girar braços para frente e para trás. Repetições em cada sentido', 
       'Módulo 1', 'Aquecimento', 'Ombro', 10, 3, 1),
       (2,'Mobilidade de ombro com corda ou teraband (Girar ombros - Circundução)', 
       'Módulo 1', 'Aquecimento', 'Ombro', 10, 1, 2),
       (3, 'Travessia Livre Ida e Volta Vert/Neg Leve ou Mezanino (Triangulações + Braços estendidos)', 
       'Módulo 1', 'Desenvolvimento', '-', 30, 2, 3);

INSERT INTO PROGRAMACAO (ID, ID_CLIENTE, ID_TREINO, DT_INICIO, DT_FINAL)  
values (1, 1, 1, '2025-01-01', '2025-02-28'),
       (2, 1, 2, '2025-01-01', '2025-02-28'),
       (3, 1, 3, '2025-01-01', '2025-02-28'),
       (4, 2, 1, '2025-02-01', '2025-03-31'),
       (5, 2, 2, '2025-02-01', '2025-03-31'),
       (6, 2, 3, '2025-02-01', '2025-03-31');	   