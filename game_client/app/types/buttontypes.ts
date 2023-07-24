export interface ButtonStyles {
    color?: string,
    bgcolor?: string,
    margin?: string,
    padding?: string,
    border?: string,
    borderRadius?: string,
    fontSize?: string,
    fontWeight?: string,
}

export interface ButtonProps {
    buttonStyles: ButtonStyles 
    children?: string | JSX.Element | JSX.Element[]
}  