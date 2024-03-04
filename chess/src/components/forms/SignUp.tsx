import { Button, Stack, TextField } from "@mui/material";
import React from "react";
import { useForm } from "react-hook-form";

const SignUp = () => {

  const { 
    register,
    formState: { errors },
    handleSubmit,
  } = useForm<SignUpFormData>({
      
  });

  const onSubmit = (data: SignUpFormData) => {

  }

  return (
    <>
      <form onSubmit={handleSubmit(onSubmit)}>
        <Stack>
          <TextField 
              label="First Name"
              type="text"
              {...register("firstName", { required: "First Name is required"})}
              error={!!errors.firstName}
              helperText={errors.firstName?.message}
          />
          <TextField 
              label="Last Name"
              type="text"
              {...register("lastName", { required: "Last Name is required"})}
              error={!!errors.lastName}
              helperText={errors.lastName?.message}
          />
          <TextField 
              label="Username"
              type="text"
              {...register("username", { required: "Username is required"})}
              error={!!errors.username}
              helperText={errors.username?.message}
          />
          <TextField 
              label="Email"
              type="email"
              {...register("email", { required: "Email is not valid"})}
              error={!!errors.email}
              helperText={errors.email?.message}
          />
          <TextField 
              label="Password"
              type="password"
              {...register("password", { required: "Password must only contain a-z, A-Z, 0-9, and be from 8 to 32 chars long"})}
              error={!!errors.password}
              helperText={errors.password?.message}
          />
          <TextField 
              label="Confirm Password"
              type="text"
              {...register("confirmPassword", { required: "Passwords do  not match"})}
              error={!!errors.confirmPassword}
              helperText={errors.confirmPassword?.message}
          />
          <Button
              type="submit"
          >
            Sign Up
          </Button>
        </Stack>
      </form>
    </>
  );
}

export default SignUp;