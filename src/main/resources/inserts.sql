INSERT INTO roles (name) VALUES ('ADMIN');
INSERT INTO roles (name) VALUES ('USER');

-- Insertar encuestas en la tabla surveys
INSERT INTO surveys (create_at, updated_at, description, name) 
VALUES (NOW(), NOW(), 'Encuesta de satisfacción del cliente', 'Satisfacción 2024'),
       (NOW(), NOW(), 'Encuesta sobre la calidad del servicio', 'Calidad Servicio 2024'),
       (NOW(), NOW(), 'Encuesta de bienestar laboral', 'Bienestar 2024'),
       (NOW(), NOW(), 'Encuesta de experiencia del usuario', 'Experiencia Usuario 2024'),
       (NOW(), NOW(), 'Encuesta de retroalimentación sobre el producto', 'Feedback Producto 2024'),
       (NOW(), NOW(), 'Encuesta de opinión de empleados', 'Opinión Empleados 2024'),
       (NOW(), NOW(), 'Encuesta de salud y seguridad en el trabajo', 'Salud y Seguridad 2024'),
       (NOW(), NOW(), 'Encuesta sobre la accesibilidad en los servicios', 'Accesibilidad 2024'),
       (NOW(), NOW(), 'Encuesta de satisfacción con el soporte técnico', 'Satisfacción Soporte 2024'),
       (NOW(), NOW(), 'Encuesta de evaluación de desempeño', 'Evaluación Desempeño 2024');
      
INSERT INTO chapters (create_at, updated_at, survey_id, chapter_title)
VALUES 
  (NOW(), NOW(), 1, 'Intro: Satisfacción del Cliente'),
  (NOW(), NOW(), 2, 'Análisis de la Calidad del Servicio'),
  (NOW(), NOW(), 3, 'Bienestar en el Lugar de Trabajo'),
  (NOW(), NOW(), 4, 'Experiencia de Usuario'),
  (NOW(), NOW(), 5, 'Feedback del Producto'),
  (NOW(), NOW(), 6, 'Opiniones de los Empleados'),
  (NOW(), NOW(), 7, 'Salud y Seguridad en el Trabajo'),
  (NOW(), NOW(), 8, 'Accesibilidad en los Servicios'),
  (NOW(), NOW(), 9, 'Satisfacción con el Soporte Técnico'),
  (NOW(), NOW(), 10, 'Evaluación del Desempeño');


-- Insertar preguntas para el Capítulo 1 (survey_id = 1)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Qué tan satisfecho estás con nuestro servicio?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Qué mejorarías en nuestro producto?', 'Texto Libre'),
  (NOW(), NOW(), '¿Recomendarías nuestro servicio a un amigo?', 'Sí/No');

-- Insertar preguntas para el Capítulo 2 (survey_id = 2)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Qué edad tienes?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Cuál es tu género?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Cuál es tu nivel educativo?', 'Selección Múltiple');

-- Insertar preguntas para el Capítulo 3 (survey_id = 3)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Con qué frecuencia utilizas nuestros productos?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Qué características valoras más en un producto?', 'Texto Libre'),
  (NOW(), NOW(), '¿Estás dispuesto a pagar más por mejor calidad?', 'Sí/No');

-- Insertar preguntas para el Capítulo 4 (survey_id = 4)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Cuántas veces has comprado en nuestra tienda?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Cómo describirías tu experiencia de compra?', 'Texto Libre'),
  (NOW(), NOW(), '¿Volverías a comprar con nosotros?', 'Sí/No');

-- Insertar preguntas para el Capítulo 5 (survey_id = 5)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Cuál es tu método de pago preferido?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Cuánto tiempo tardaste en recibir tu pedido?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿El pedido llegó en buen estado?', 'Sí/No');

-- Insertar preguntas para el Capítulo 6 (survey_id = 6)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Qué tan útil fue la atención al cliente?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Qué problemas tuviste durante tu compra?', 'Texto Libre'),
  (NOW(), NOW(), '¿Repetirías la experiencia de compra?', 'Sí/No');

-- Insertar preguntas para el Capítulo 7 (survey_id = 7)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Te parece justo el precio de nuestros productos?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Qué opinas de la variedad de productos?', 'Texto Libre'),
  (NOW(), NOW(), '¿Pagarías más por productos personalizados?', 'Sí/No');

-- Insertar preguntas para el Capítulo 8 (survey_id = 8)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Cómo calificas la calidad de nuestros productos?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Qué producto te gustaría ver en el futuro?', 'Texto Libre'),
  (NOW(), NOW(), '¿Nos recomendarías a otros?', 'Sí/No');

-- Insertar preguntas para el Capítulo 9 (survey_id = 9)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Qué tan fácil fue navegar por nuestra página web?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Qué sección de la página web te resultó confusa?', 'Texto Libre'),
  (NOW(), NOW(), '¿Encontraste todo lo que buscabas?', 'Sí/No');

-- Insertar preguntas para el Capítulo 10 (survey_id = 10)
INSERT INTO questions (create_at, updated_at, question_text, response_type)
VALUES
  (NOW(), NOW(), '¿Qué tan probable es que nos vuelvas a comprar?', 'Selección Múltiple'),
  (NOW(), NOW(), '¿Qué opinas del proceso de devolución?', 'Texto Libre'),
  (NOW(), NOW(), '¿Estás satisfecho con el servicio postventa?', 'Sí/No');

-- Insertar relaciones en la tabla intermedia question_chapters
-- Capítulo 1 (survey_id = 1)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (1, 1), (1, 2), (1, 3);

-- Capítulo 2 (survey_id = 2)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (2, 4), (2, 5), (2, 6);

-- Capítulo 3 (survey_id = 3)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (3, 7), (3, 8), (3, 9);

-- Capítulo 4 (survey_id = 4)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (4, 10), (4, 11), (4, 12);

-- Capítulo 5 (survey_id = 5)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (5, 13), (5, 14), (5, 15);

-- Capítulo 6 (survey_id = 6)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (6, 16), (6, 17), (6, 18);

-- Capítulo 7 (survey_id = 7)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (7, 19), (7, 20), (7, 21);

-- Capítulo 8 (survey_id = 8)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (8, 22), (8, 23), (8, 24);

-- Capítulo 9 (survey_id = 9)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (9, 25), (9, 26), (9, 27);

-- Capítulo 10 (survey_id = 10)
INSERT INTO question_chapters (chapter_id, question_id)
VALUES 
  (10, 28), (10, 29), (10, 30);

 
-- Capítulo 1 (survey_id = 1)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 1, 'Satisfecho'),
  (NOW(), NOW(), 1, 'Neutro'),
  (NOW(), NOW(), 1, 'Mal'),

  (NOW(), NOW(), 3, 'Sí'),
  (NOW(), NOW(), 3, 'No'),
  (NOW(), NOW(), 3, 'Tal vez');

-- Capítulo 2 (survey_id = 2)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 4, '<18'),
  (NOW(), NOW(), 4, '18-35'),
  (NOW(), NOW(), 4, '>35'),

  (NOW(), NOW(), 5, 'Masc'),
  (NOW(), NOW(), 5, 'Fem'),
  (NOW(), NOW(), 5, 'Otro'),

  (NOW(), NOW(), 6, 'Primaria'),
  (NOW(), NOW(), 6, 'Secundaria'),
  (NOW(), NOW(), 6, 'Uni');

-- Capítulo 3 (survey_id = 3)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 7, 'Diario'),
  (NOW(), NOW(), 7, 'Semanal'),
  (NOW(), NOW(), 7, 'Raro'),

  (NOW(), NOW(), 9, 'Sí'),
  (NOW(), NOW(), 9, 'No'),
  (NOW(), NOW(), 9, 'Tal vez');

-- Capítulo 4 (survey_id = 4)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 10, '1-5'),
  (NOW(), NOW(), 10, '6-10'),
  (NOW(), NOW(), 10, '>10'),

  (NOW(), NOW(), 12, 'Sí'),
  (NOW(), NOW(), 12, 'No'),
  (NOW(), NOW(), 12, 'Tal vez');

-- Capítulo 5 (survey_id = 5)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 13, 'T.crédito'),
  (NOW(), NOW(), 13, 'Paypal'),
  (NOW(), NOW(), 13, 'T.bancaria'),

  (NOW(), NOW(), 14, '<1 sem'),
  (NOW(), NOW(), 14, '1-2 sem'),
  (NOW(), NOW(), 14, '>2 sem'),

  (NOW(), NOW(), 15, 'Sí'),
  (NOW(), NOW(), 15, 'No'),
  (NOW(), NOW(), 15, 'Parcial');

-- Capítulo 6 (survey_id = 6)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 16, 'Útil'),
  (NOW(), NOW(), 16, 'Neutral'),
  (NOW(), NOW(), 16, 'No útil'),

  (NOW(), NOW(), 18, 'Sí'),
  (NOW(), NOW(), 18, 'No'),
  (NOW(), NOW(), 18, 'Tal vez');

-- Capítulo 7 (survey_id = 7)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 19, 'Justo'),
  (NOW(), NOW(), 19, 'Costoso'),
  (NOW(), NOW(), 19, 'Muy caro'),

  (NOW(), NOW(), 21, 'Sí'),
  (NOW(), NOW(), 21, 'No'),
  (NOW(), NOW(), 21, 'Tal vez');

-- Capítulo 8 (survey_id = 8)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 22, 'Excelente'),
  (NOW(), NOW(), 22, 'Bueno'),
  (NOW(), NOW(), 22, 'Regular'),

  (NOW(), NOW(), 24, 'Sí'),
  (NOW(), NOW(), 24, 'No'),
  (NOW(), NOW(), 24, 'Tal vez');

-- Capítulo 9 (survey_id = 9)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 25, 'Fácil'),
  (NOW(), NOW(), 25, 'Difícil'),
  (NOW(), NOW(), 25, 'Medio'),

  (NOW(), NOW(), 27, 'Sí'),
  (NOW(), NOW(), 27, 'No'),
  (NOW(), NOW(), 27, 'Tal vez');

-- Capítulo 10 (survey_id = 10)
INSERT INTO options (create_at, updated_at, question_id, optiontext)
VALUES
  (NOW(), NOW(), 28, '100%'),
  (NOW(), NOW(), 28, 'Probable'),
  (NOW(), NOW(), 28, 'Improbable'),

  (NOW(), NOW(), 30, 'Sí'),
  (NOW(), NOW(), 30, 'No'),
  (NOW(), NOW(), 30, 'Tal vez');

