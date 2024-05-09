import { auth } from "@/auth";
import Lobbys from "@/components/Lobbys";
import { Button } from "@mui/material";

export default async function page() {
  const session = await auth();
  return (
    <main className="flex flex-col gap-4">
      <div className="border-2 border-blue-500">
        <p>{session?.user?.email}</p>
        <p>{session?.user?.name}</p>
        <p>{session?.user?.image}</p>
      </div>
      <div className="border-2 border-red-500 flex gap-12">
        <div className="border-1 rounded-lg border-green-500">
          <p>Lobbys</p>
          <Lobbys />
        </div>
        <div className="border-1 rounded-lg border-green-500">
          <p>Gamerooms</p>
          <Button>Create Gameroom</Button>
        </div>
      </div>
    </main>
  );
}
