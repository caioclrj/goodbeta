# App
Esta pasta contém artefatos referentes ao App em Kotlin do projeto GoodBeta. 

Itens marcados estão implementados como pretendido ao projeto.

Itens não marcados demandam implementação complementar - como explicado no post do Forum de Discussão 2 
realizado por Caio Clementino Lamarão na sexta-feira, 11 abr. 2025, às 21:48.  

* Os artefatos são:
 
  1. Model - classes de interface com o banco de dados
  - [x] com.goodbeta.cliente.model.Cliente 
  - [x] com.goodbeta.cliente.model.Treino
  - [x] com.goodbeta.cliente.model.Programação
  - [x] com.goodbeta.cliente.model.Execução
  - [x] com.goodbeta.cliente.model.Feedback

  
  2. Dao - classes de interface com ações ao banco de dados e ao modelo 
  - [x] com.goodbeta.cliente.dao.Cliente 
  - [x] com.goodbeta.cliente.dao.Treino
  - [x] com.goodbeta.cliente.dao.Programação
  - [x] com.goodbeta.cliente.dao.Execução
  - [x] com.goodbeta.cliente.dao.Feedback


  3. ViewModel - classes de interface do Modelo às Views ( layouts )
  - [ ] com.goodbeta.cliente.ui.viewmodel.FeedbackViewModel
  - [ ] com.goodbeta.cliente.ui.viewmodel.ExecucaoViewModel
  - [ ] com.goodbeta.cliente.ui.viewmodel.LoginViewModel


  4. Activity - classes de interface da app com ViewModel
  - [ ] com.goodbeta.cliente.activity.FeedbackActivity 
  - [ ] com.goodbeta.cliente.activity.ExecucaoActivity
  - [ ] com.goodbeta.cliente.activity.LoginActivity


  5. Layout - o pacote de layout res - resources - é definido como classe R. Os arquivos fontes são '.xml' 
  - [x] com.goodbeta.com.R.layout.login_activity
  - [x] com.goodbeta.com.R.layout.feedback_activity
  - [x] com.goodbeta.com.R.layout.execucao_activity


  6. Database - classes de configuração do banco de dados
  - [x] com.goodbeta.cliente.database.AppDatabase - configuração de database
  - [x] com.goodbeta.cliente.database.Converters - conversor de dados entre app e banco de dados

  
  7. Assets - o arquivo fisico do banco de dados pré-populado, com dados de Cliente, Treino e Programação 
  - [x] com.goodbate.cliente.com.assets.database.goodbeta.db


** O conteúdo do arquivo de teste pode ser executado na ferramenta One Compile Tester
  [https://onecompiler.com/sqlserver](https://onecompiler.com/sqlite)
