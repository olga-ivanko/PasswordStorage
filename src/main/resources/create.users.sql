-- users table.
CREATE TABLE IF NOT EXISTS `users` (
    `id` INTEGER PRIMARY KEY AUTOINCREMENT,
    `username` TEXT UNIQUE,
    `password` TEXT
);