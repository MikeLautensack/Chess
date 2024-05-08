import { Container, Typography } from "@mui/material";
import Link from "next/link";
import { containerStyles } from "./styles";

const Home = () => {
  return (
    <Container maxWidth="xl" sx={containerStyles}>
      <Typography>Home</Typography>
      <Link href="/sign-in">Sign In</Link>
      <Link href="/sign-up">Sign Up</Link>
    </Container>
  );
};

export default Home;
