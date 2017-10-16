-- Table: calcado

-- DROP TABLE calcado;

CREATE TABLE calcado
(
  id serial NOT NULL,
  nome_do_calcado character varying(50) NOT NULL,
  colecao character varying(50) NOT NULL,
  menor_tamanho integer NOT NULL,
  maior_tamanho integer NOT NULL,
  cor_do_calcado character varying(50),
  preco_de_custo double precision NOT NULL,
  CONSTRAINT id_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE calcado
  OWNER TO postgres;

-- POPULA AS TABELAS

insert into calcado(id, nome_do_calcado, colecao, menor_tamanho, maior_tamanho, cor_do_calcado, preco_de_custo) values (1, 'Sapatilha', 'Verão', 34, 44, 'Vermelho',18);

insert into calcado(id, nome_do_calcado, colecao, menor_tamanho, maior_tamanho, cor_do_calcado, preco_de_custo) values (2, 'Sandália', 'Verão', 36, 42, 'Verde', 13);

insert into calcado(id, nome_do_calcado, colecao, menor_tamanho, maior_tamanho, cor_do_calcado, preco_de_custo) values (3, 'Sapato', 'Trabalho', 38, 44, 'Preto', 28);

insert into calcado(id, nome_do_calcado, colecao, menor_tamanho, maior_tamanho, cor_do_calcado, preco_de_custo) values (4, 'Tênis', 'Esportes', 34, 42, 'Amarelo', 15);
