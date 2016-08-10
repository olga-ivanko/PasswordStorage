-- Storage table
CREATE TABLE IF NOT EXISTS `storage` (
    `id` INTEGER PRIMARY KEY AUTOINCREMENT,
    `target` TEXT,    
    `username` TEXT,
    `password` TEXT,
    `password_hash` TEXT,
    `user_id` INTEGER,

    FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
);