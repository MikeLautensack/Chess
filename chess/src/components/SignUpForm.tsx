import React from "react";
import { Box, TextField, InputLabel, Button, Typography } from "@mui/material";
import { useForm, Controller, SubmitHandler } from "react-hook-form";
import { zodResolver } from "@hookform/resolvers/zod";
import { z } from "zod";

const SignUpFormSchema = z.object({
  gmail: z.string(),
});

type SignUpFormValues = z.infer<typeof SignUpFormSchema>;

const SignUpForm = () => {
  const {
    handleSubmit,
    control,
    formState: { errors },
  } = useForm<SignUpFormValues>({
    resolver: zodResolver(SignUpFormSchema),
    defaultValues: { gmail: "" },
  });

  const onSubmit: SubmitHandler<SignUpFormValues> = (
    formData: SignUpFormValues
  ) => {
    console.log(formData);
  };

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <Box>
        <Typography>Sign Up</Typography>
        <Box>
          <InputLabel>Gmail</InputLabel>
          <Controller
            name="gmail"
            control={control}
            render={({ field }) => (
              <TextField
                {...field}
                label="gmail"
                error={!!errors.gmail}
                helperText={errors.gmail?.message as React.ReactNode}
              />
            )}
          />
        </Box>
        {/* <Box>
          <InputLabel>Input</InputLabel>
          <Controller
            name="input"
            control={control}
            render={({ field }) => (
              <TextField
                {...field}
                label="input"
                error={!!errors.input}
                helperText={errors.input?.message as React.ReactNode}
              />
            )}
          />
        </Box> */}
        <Button type="submit">Submit</Button>
      </Box>
    </form>
  );
};

export default SignUpForm;
