export interface Inputs {
    search: string
}

export interface SearchProps {
    inputStyles?: string,
    buttonStyles?: string,
    onSearch: (query: Inputs  ) => void | undefined
} 