import {
  pgTable,
  serial,
  text,
  timestamp,
  uniqueIndex,
} from 'drizzle-orm/pg-core';

export const GamesTable = pgTable(
  'games',
  {
    id: serial('id').primaryKey(),
    playingWhite: text('playing_white').notNull(),
    playingBlack: text('playing_black').notNull(),
    createdAt: timestamp('createdAt').defaultNow().notNull(),
  },
  (games) => {
    return {
      uniqueIdx: uniqueIndex('unique_game_idx').on(games.id),
    };
  },
);