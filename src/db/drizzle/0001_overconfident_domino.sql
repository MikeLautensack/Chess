CREATE TABLE IF NOT EXISTS "games" (
	"id" serial PRIMARY KEY NOT NULL,
	"playing_white" text NOT NULL,
	"playing_black" text NOT NULL,
	"createdAt" timestamp DEFAULT now() NOT NULL
);
--> statement-breakpoint
DROP INDEX IF EXISTS "unique_idx";--> statement-breakpoint
CREATE UNIQUE INDEX IF NOT EXISTS "unique_game_idx" ON "games" ("id");--> statement-breakpoint
CREATE UNIQUE INDEX IF NOT EXISTS "unique_user_idx" ON "users" ("email");