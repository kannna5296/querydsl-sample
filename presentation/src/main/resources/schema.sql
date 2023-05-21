CREATE TABLE book (
  id VARCHAR(255) PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  author VARCHAR(255) NOT NULL,
  release_date DATETIME
);

CREATE TABLE rental (
  id VARCHAR(255) PRIMARY KEY,
  user_id INT NOT NULL,
  book_id VARCHAR(255) NOT NULL,
  rental_date TIMESTAMP NOT NULL,
  return_deadline DATETIME NOT NULL
);