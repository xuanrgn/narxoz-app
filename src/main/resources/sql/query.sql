select * from users;

delete from books;

select * from books;

insert into books(id, author, category, title, year, owner_id)
values (1, 'Some Author', 'Some Category', 'Book Title', 2000, 7)